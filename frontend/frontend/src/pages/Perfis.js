import React, { useState } from 'react';
import Navbar from '../components/Navbar';
import './Perfis.css';

export default function Perfis() {
  // Mock de perfis
  const [perfis, setPerfis] = useState([
    { id: 1, nome: 'Pessoal', descricao: 'Gastos pessoais', limite: 2000 },
    { id: 2, nome: 'Trabalho', descricao: 'Despesas do trabalho', limite: 1500 },
  ]);
  const [form, setForm] = useState({ nome: '', descricao: '', limite: '' });

  const handleChange = e => setForm({ ...form, [e.target.name]: e.target.value });

  const handleSubmit = e => {
    e.preventDefault();
    setPerfis([...perfis, { ...form, id: Date.now() }]);
    setForm({ nome: '', descricao: '', limite: '' });
  };

  return (
    <>
      <Navbar />
      <div className="perfis-container">
        <h2>Perfis</h2>
        <form className="perfil-form" onSubmit={handleSubmit}>
          <input name="nome" placeholder="Nome do Perfil" value={form.nome} onChange={handleChange} required />
          <input name="descricao" placeholder="Descrição" value={form.descricao} onChange={handleChange} />
          <input name="limite" type="number" placeholder="Limite Mensal" value={form.limite} onChange={handleChange} />
          <button type="submit">Adicionar Perfil</button>
        </form>
        <table className="perfil-table">
          <thead>
            <tr>
              <th>Nome</th>
              <th>Descrição</th>
              <th>Limite Mensal</th>
            </tr>
          </thead>
          <tbody>
            {perfis.map(perfil => (
              <tr key={perfil.id}>
                <td>{perfil.nome}</td>
                <td>{perfil.descricao}</td>
                <td>R$ {Number(perfil.limite).toFixed(2)}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
}