package ec.edu.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_doctor"))
	@SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor",allocationSize = 1)
	@Column(name="doct_id")
	private Integer id;
	@Column(name="doct_cedula")
	private String cedula;
	@Column(name="doct_nombre")
	private String nombre;
	@Column(name="doct_apellido")
	private String apellido;
	@Column(name="doct_fecha_nacimiento")
	private LocalDateTime fecha_nacimiento;
	@Column(name = "doct_numero_consultorio")
	private Integer numeroCosultorio;
	@Column(name="doct_codigo_senecyt")
	private Integer codigoSenecyt;
	@Column(name="doct_sueldo")
	private BigDecimal sueldo;
	
	
	@OneToMany(mappedBy = "doctor",cascade=CascadeType.ALL) //FECTH CARGA A LOS HIJOS LOS PRECARGA
	private List<CitaMedica> citas;
	
	
	
	
	public List<CitaMedica> getCitas() {
		return citas;
	}
	public void setCitas(List<CitaMedica> citas) {
		this.citas = citas;
	}
	//Metodos set y get
	
	public Integer getId() {
		return id;
	}
	public Integer getNumeroCosultorio() {
		return numeroCosultorio;
	}
	public void setNumeroCosultorio(Integer numeroCosultorio) {
		this.numeroCosultorio = numeroCosultorio;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDateTime fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Integer getCodigoSenecyt() {
		return codigoSenecyt;
	}
	public void setCodigoSenecyt(Integer codigoSenecyt) {
		this.codigoSenecyt = codigoSenecyt;
	}
	public BigDecimal getSueldo() {
		return sueldo;
	}
	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
	

	
}
