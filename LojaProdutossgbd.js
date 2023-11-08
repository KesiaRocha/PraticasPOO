const express = require('express');
const bodyParser = require('body-parser');
const sqlite3 = require('sqlite3').verbose();

const app = express();
const port = 8765;

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// Conecte-se ao banco de dados SQLite
const db = new sqlite3.Database('Loja.db', (err) => {
    if (err) {
        console.error(err.message);
    } else {
        console.log('Conectado ao banco de dados SQLite.');
    }
});

// Crie a tabela TB_ALUNOS, se ainda não existir
db.run(
    'CREATE TABLE IF NOT EXISTS TB_CLIENTES (ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME_CLI TEXT)',
    (err) => {
        if (err) {
            console.error('Erro ao criar tabela TB_CLIENTES:', err.message);
        } else {
            console.log('Tabela TB_CLIENTES criada com sucesso.');
        }
    }
);

db.run(
    'CREATE TABLE IF NOT EXISTS TB_NOTAS_FISCAIS (ID INTEGER PRIMARY KEY AUTOINCREMENT, VALOR INTEGER NOT NULL, CLIENTE_ID INTEGER NOT NULL, VENDEDOR_ID INTEGER NOT NULL, foreign key (CLIENTE_ID) REFERENCES TB_CLIENTES(ID),  foreign key (VENDEDOR_ID) REFERENCES TB_CLIENTES(ID))',
    (err) => {
        if (err) {
            console.error('Erro ao criar tabela TB_NOTAS_FISCAIS:', err.message);
        } else {
            console.log('Tabela TB_NOTAS_FISCAIS criada com sucesso.');
        }
    }
);

db.run(
    'CREATE TABLE IF NOT EXISTS TB_VENDEDOR (ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME_VEND TEXT NOT NULL)',
    (err) => {
        if (err) {
            console.error('Erro ao criar tabela TB_VENDEDOR:', err.message);
        } else {
            console.log('Tabela TB_VENDEDOR criada com sucesso.');
        }
    }
);

db.run(
    'CREATE TABLE IF NOT EXISTS TB_PRODUTOS (ID INTEGER PRIMARY KEY AUTOINCREMENT, DESC TEXT NOT NULL, PRECO_UNIT REAL NOT NULL)',
    (err) => {
        if (err) {
            console.error('Erro ao criar tabela TB_PRODUTOS:', err.message);
        } else {
            console.log('Tabela TB_PRODUTOS criada com sucesso.');
        }
    }
);

db.run(
    'CREATE TABLE IF NOT EXISTS TB_ITENS_NOTAFISCAL (ID INTEGER PRIMARY KEY AUTOINCREMENT, UNIDADE INTEGER, QTD FLOAT, NOTAFISCAL_ID INTEGER, COD_PRO INTEGER, PRODUTO_ID INTEGER, FOREIGN KEY (COD_PRO) REFERENCES TB_PRODUTOS(COD_PRO), FOREIGN KEY (NOTAFISCAL_ID) REFERENCES TB_NOTAS_FISCAIS(ID), FOREIGN KEY (PRODUTO_ID) REFERENCES TB_PRODUTOS(ID))',
    (err) => {
        if (err) {
            console.error('Erro ao criar tabela TB_ITENS_NOTAFISCAL:', err.message);
        } else {
            console.log('Tabela TB_ITENS_NOTAFISCAL criada com sucesso.');
        }
    }
);


app.post('/clientes', (req, res) => {
    const { END_CLI, NOME_CLI } = req.body;
    db.run('INSERT INTO TB_CLIENTES (END_CLI, NOME_CLI) VALUES (?, ?)', [END_CLI, NOME_CLI], (err) => {
        if (err) {
            res.status(500).json({ error: err.message });
            return;
        }
        res.status(201).json({ message: 'Cliente criado com sucesso' });
    });
});

/* Obter todos os alunos
app.get('/alunos', (req, res) => {
    db.all('SELECT * FROM TB_ALUNOS', (err, rows) => {
        if (err) {
            res.status(500).json({ error: err.message });
            return;
        }
        res.json({ alunos: rows });
    });
});

// Obter um aluno por ID
app.get('/alunos/:id', (req, res) => {
    const { id } = req.params;
    db.get('SELECT * FROM TB_ALUNOS WHERE id = ?', [id], (err, row) => {
        if (err) {
            res.status(500).json({ error: err.message });
            return;
        }
        if (!row) {
            res.status(404).json({ message: 'Aluno não encontrado' });
            return;
        }
        res.json({ aluno: row });
    });
});

// Atualizar um aluno por ID
app.put('/alunos/:id', (req, res) => {
    const { id } = req.params;
    const { nome, matricula } = req.body;
    db.run('UPDATE TB_ALUNOS SET nome = ?, matricula = ? WHERE id = ?', [nome, matricula, id], (err) => {
        if (err) {
            res.status(500).json({ error: err.message });
            return;
        }
        res.json({ message: 'Aluno atualizado com sucesso' });
    });
});

// Excluir um aluno por ID
app.delete('/alunos/:id', (req, res) => {
    const { id } = req.params;
    db.run('DELETE FROM TB_ALUNOS WHERE id = ?', [id], (err) => {
        if (err) {
            res.status(500).json({ error: err.message });
            return;
        }
        res.json({ message: 'Aluno excluído com sucesso' });
    });
});

app.post('/notasfiscais', (req, res) => {
    const { nome, matricula } = req.body;
    db.run('INSERT INTO TB_CL (END_CLI, NOME_CLI) VALUES (?, ?)', [END_CLI, NOME_CLI], (err) => {
        if (err) {
            res.status(500).json({ error: err.message });
            return;
        }
        res.status(201).json({ message: 'Cliente criado com sucesso' });
    });
});*/


// Inicie o servidor
app.listen(port, () => {
    console.log(`Servidor está ouvindo na porta ${port}`);
});