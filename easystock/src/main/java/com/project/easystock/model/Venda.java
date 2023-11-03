package com.project.easystock.model;

import java.io.Serializable;
import java.util.Date;

public class Venda implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
    private int idProduto;
    private int idCliente;
    private int quantidade;
    private double precoUnitario;
    private double totalVenda;
    private Date dataVenda;
    private String enderecoEntrega;
    private Date dataEntregaEstimada;
    private Date dataEntregaExata;
    private String statusPagamento;
    private String statusEntrega;
    private double custoEnvio;
    
	public Venda(int id, int idProduto, int idCliente, int quantidade, double precoUnitario, double totalVenda,
			Date dataVenda, String enderecoEntrega, Date dataEntregaEstimada, Date dataEntregaExata,
			String statusPagamento, String statusEntrega, double custoEnvio) {
		
		this.id = id;
		this.idProduto = idProduto;
		this.idCliente = idCliente;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.totalVenda = totalVenda;
		this.dataVenda = dataVenda;
		this.enderecoEntrega = enderecoEntrega;
		this.dataEntregaEstimada = dataEntregaEstimada;
		this.dataEntregaExata = dataEntregaExata;
		this.statusPagamento = statusPagamento;
		this.statusEntrega = statusEntrega;
		this.custoEnvio = custoEnvio;
	}
	
	public Venda() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public Date getDataEntregaEstimada() {
		return dataEntregaEstimada;
	}

	public void setDataEntregaEstimada(Date dataEntregaEstimada) {
		this.dataEntregaEstimada = dataEntregaEstimada;
	}

	public Date getDataEntregaExata() {
		return dataEntregaExata;
	}

	public void setDataEntregaExata(Date dataEntregaExata) {
		this.dataEntregaExata = dataEntregaExata;
	}

	public String getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public String getStatusEntrega() {
		return statusEntrega;
	}

	public void setStatusEntrega(String statusEntrega) {
		this.statusEntrega = statusEntrega;
	}

	public double getCustoEnvio() {
		return custoEnvio;
	}

	public void setCustoEnvio(double custoEnvio) {
		this.custoEnvio = custoEnvio;
	}
	
}
