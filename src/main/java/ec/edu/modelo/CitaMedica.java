package ec.edu.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "cita_medica")
public class CitaMedica {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_cime"))
	@SequenceGenerator(name = "seq_cime", sequenceName = "seq_cime",allocationSize = 1)
	@Column(name="cime_id")
	private Integer id;
	@Column(name="cime_numero")
	private Integer numero;
	@Column(name = "cime_fecha_cita")
	private LocalDateTime fecha_cita;
	@Column(name="cime_valor_cita")
	private BigDecimal valorCita;
	@Column(name="cime_lugar_cita")
	private String lugarCita;
	@Column(name="cime_diagnostico")
	private String diagnostico;
	@Column(name="cime_receta")
	private String receta;
	@Column(name="cime_fecha_control")
	private LocalDateTime fechaControl;
	
	//relaciones
	
	@ManyToOne
	@JoinColumn(name = "paci_id")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "doct_id")
	private Doctor doctor;
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	//metdos set y get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha_cita() {
		return fecha_cita;
	}
	public void setFecha_cita(LocalDateTime fecha_cita) {
		this.fecha_cita = fecha_cita;
	}
	public BigDecimal getValorCita() {
		return valorCita;
	}
	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}
	public String getLugarCita() {
		return lugarCita;
	}
	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	public LocalDateTime getFechaControl() {
		return fechaControl;
	}
	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}
	
	
	
	
}
