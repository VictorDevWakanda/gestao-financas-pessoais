import React, { useState } from 'react';
import Navbar from '../components/Navbar';
import './Transacoes.css';

export default function Transacoes() {
  const [transacoes, setTransacoes] = useState([
    { id: 1, tipo: 'Receita', descricao: 'Salário', valor: 4000, data: '2024-06-01' },
    { id: 2, tipo: 'Despesa', descricao: 'Supermercado', valor: 350, data: '2024-06-05' },
  ]);
  const [form, setForm] = useState({ tipo: 'Receita', descricao: '', valor: '', data: '' });

  const handleChange = e => setForm({ ...form, [e.target.name]: e.target.value });

  const handleSubmit = e => {
    e.preventDefault();
    setTransacoes([...transacoes, { ...form, id: Date.now() }]);
    setForm({ tipo: 'Receita', descricao: '', valor: '', data: '' });
  };

  return (
    <>
      <Navbar />
      <div className="transacoes-container">
        <h2>Transações</h2>
        <form className="transacao-form" onSubmit={handleSubmit}>
          <select name="tipo" value={form.tipo} onChange={handleChange}>
            <option value="Receita">Receita</option>
            <option value="Despesa">Despesa</option>
          </select>
          <input name="descricao" placeholder="Descrição" value={form.descricao} onChange={handleChange} required />
          <input name="valor" type="number" placeholder="Valor" value={form.valor} onChange={handleChange} required />
          <input name="data" type="date" value={form.data} onChange={handleChange} required />
          <button type="submit">Adicionar</button>
        </form>
        <table className="transacao-table">
          <thead>
            <tr>
              <th>Tipo</th>
              <th>Descrição</th>
              <th>Valor</th>
              <th>Data</th>
            </tr>
          </thead>
          <tbody>
            {transacoes.map(t => (
              <tr key={t.id}>
                <td>{t.tipo}</td>
                <td>{t.descricao}</td>
                <td>R$ {Number(t.valor).toFixed(2)}</td>
                <td>{t.data}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
}