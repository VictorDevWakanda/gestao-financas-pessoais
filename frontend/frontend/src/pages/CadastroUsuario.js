import React, { useState } from 'react';
import { criarUsuario } from '../api/usuarioService';
import './CadastroUsuario.css';

export default function CadastroUsuario() {
  const [form, setForm] = useState({
    nome: '',
    email: '',
    senha: '',
    dataNascimento: '',
    cpf: '',
    telefone: ''
  });

  const [loading, setLoading] = useState(false);

  const handleChange = e => setForm({ ...form, [e.target.name]: e.target.value });

  const handleSubmit = async e => {
    e.preventDefault();
    setLoading(true);
    try {
      await criarUsuario(form);
      alert('Usuário cadastrado com sucesso!');
      window.location.href = '/login';
    } catch (err) {
      alert('Erro ao cadastrar usuário');
    }
    setLoading(false);
  };

  return (
    <div className="cadastro-container">
      <form className="cadastro-form" onSubmit={handleSubmit}>
        <h2>Cadastro de Usuário</h2>
        <input name="nome" placeholder="Nome" onChange={handleChange} required />
        <input name="email" type="email" placeholder="Email" onChange={handleChange} required />
        <input name="senha" type="password" placeholder="Senha" onChange={handleChange} required />
        <input name="dataNascimento" type="date" onChange={handleChange} required />
        <input name="cpf" placeholder="CPF" onChange={handleChange} required />
        <input name="telefone" placeholder="Telefone" onChange={handleChange} required />
        <button type="submit" disabled={loading}>{loading ? 'Cadastrando...' : 'Cadastrar'}</button>
        <p>
          Já tem conta? <a href="/login">Entrar</a>
        </p>
      </form>
    </div>
  );
}