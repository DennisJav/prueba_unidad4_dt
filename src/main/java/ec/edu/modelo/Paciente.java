package ec.edu.modelo;

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
@Table(name = "paciente")
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("seq_paciente"))
	@SequenceGenerator(name = "seq_paciente", sequenceName = "seq_paciente",allocationSize = 1)
	@Column(name="paci_id")
	private Integer id;
	@Column(name="paci_cedula")
	private String cedula;
	@Column(name="paci_nombre")
	private String nombre;
	@Column(name="paci_apellido")
	private String apellido;
	@Column(name="paci_fecha_nacimiento")
	private LocalDateTime fecha_nacimiento;
	@Column(name="paci_codigo_iess")
	private Integer codigoIess;
	@Column(name="paci_estatura")
	private Integer estatura;
	@Column(name="paci_peso")
	private Integer peso;
	@Column(name="paci_edad")
	private Integer edad;
	
	@OneToMany(mappedBy = "paciente",cascade=CascadeType.ALL) //FECTH CARGA A LOS HIJOS LOS PRECARGA
	private List<CitaMedica> citas;
	
	
	
	public List<CitaMedica> getCitas() {
		return citas;
	}
	public void setCitas(List<CitaMedica> citas) {
		this.citas = citas;
	}
	
	
	public Integer getId() {
		return id;
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
	public Integer getCodigoIess() {
		return codigoIess;
	}
	public void setCodigoIess(Integer codigoIess) {
		this.codigoIess = codigoIess;
	}
	public Integer getEstatura() {
		return estatura;
	}
	public void setEstatura(Integer estatura) {
		this.estatura = estatura;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
	
}
