package com.voya.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String pagamento;
	
	@Column(nullable = false)
	private String destino_viagem;
	
	@Column(nullable = false)
	private String data_ida;
	
	@Column(nullable = false)
    private String data_volta;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public String getDestino_viagem() {
		return destino_viagem;
	}
	public void setDestino_viagem(String destino_viagem) {
		this.destino_viagem = destino_viagem;
	}
	public String getData_ida() {
		return data_ida;
	}
	public void setData_ida(String data_ida) {
		this.data_ida = data_ida;
	}
	public String getData_volta() {
		return data_volta;
	}
	public void setData_volta(String data_volta) {
		this.data_volta = data_volta;
	}
	public Destino(Long id, String pagamento, String destino_viagem, String data_ida, String data_volta) {
		super();
		this.id = id;
		this.pagamento = pagamento;
		this.destino_viagem = destino_viagem;
		this.data_ida = data_ida;
		this.data_volta = data_volta;
	}
	public Destino() {
		super();
	}
    
	
    
    
}
