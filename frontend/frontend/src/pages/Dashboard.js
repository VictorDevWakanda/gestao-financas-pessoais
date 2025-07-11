import React from 'react';
import Navbar from '../components/Navbar';
import './Dashboard.css';

export default function Dashboard() {
  // Dados mockados para exemplo
  const saldo = 2500.00;
  const receitas = 4000.00;
  const despesas = 1500.00;

  return (
    <>
      <Navbar />
      <div className="dashboard-container">
        <h2>Resumo Financeiro</h2>
        <div className="dashboard-cards">
          <div className="dashboard-card saldo">
            <span>Saldo Atual</span>
            <strong>R$ {saldo.toFixed(2)}</strong>
          </div>
          <div className="dashboard-card receitas">
            <span>Receitas</span>
            <strong>R$ {receitas.toFixed(2)}</strong>
          </div>
          <div className="dashboard-card despesas">
            <span>Despesas</span>
            <strong>R$ {despesas.toFixed(2)}</strong>
          </div>
        </div>
        <div className="dashboard-grafico">
          <h3>Gráfico de Gastos (em breve)</h3>
          <div className="grafico-placeholder">[Gráfico aqui]</div>
        </div>
      </div>
    </>
  );
}