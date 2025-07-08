import React from 'react';
import Navbar from '../components/Navbar';
import { Pie } from 'react-chartjs-2';
import { Chart, ArcElement, Tooltip, Legend } from 'chart.js';
import './Relatorios.css';

Chart.register(ArcElement, Tooltip, Legend);

export default function Relatorios() {
  // Dados mockados
  const data = {
    labels: ['Alimentação', 'Transporte', 'Lazer', 'Outros'],
    datasets: [
      {
        label: 'Despesas',
        data: [500, 200, 300, 100],
        backgroundColor: [
          '#61dafb',
          '#2d3e50',
          '#ff6384',
          '#36a2eb'
        ],
        borderWidth: 1,
      },
    ],
  };

  return (
    <>
      <Navbar />
      <div className="relatorios-container">
        <h2>Relatórios & Gráficos</h2>
        <div className="grafico-relatorio">
          <Pie data={data} />
        </div>
      </div>
    </>
  );
}