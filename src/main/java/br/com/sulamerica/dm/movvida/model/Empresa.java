package br.com.sulamerica.dm.movvida.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Empresa implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Código de Empresa")
	private java.lang.String codigoEmpresa;
	@org.kie.api.definition.type.Label("Carteira")
	private java.lang.String carteira;
	@org.kie.api.definition.type.Label("Código de Produto")
	private int codigoProduto;
	@org.kie.api.definition.type.Label("Número de Apólice")
	private int numeroApolice;
	@org.kie.api.definition.type.Label("Data de Início da Vigência")
	private java.time.LocalDate dataInicioVigencia;
	@org.kie.api.definition.type.Label("Data de Final da Vigência")
	private java.time.LocalDate dataFinalVigencia;

	@org.kie.api.definition.type.Label("Grupo mecsas")
	private java.lang.String codigoGrupoMecsas;

	@org.kie.api.definition.type.Label("Número de Contrato ISOdonto")
	private java.lang.String numeroContrato;

	@org.kie.api.definition.type.Label("Flag Pro-Rata")
	private boolean proRata;

	@org.kie.api.definition.type.Label("Data de inicio da vigencia da empresa principal")
	private java.time.LocalDate dataInicioVigenciaEmpresaPrincipal;

	@org.kie.api.definition.type.Label("Permanencia")
	private java.lang.String permanencia;

	@org.kie.api.definition.type.Label("codigo Fator Plano")
	private java.lang.String codFatorPlano;

	@org.kie.api.definition.type.Label("codigo de Classificacao Ci")
	private int codClassificacaoCi;

	public Empresa() {
	}

	public java.lang.String getCodigoEmpresa() {
		return this.codigoEmpresa;
	}

	public void setCodigoEmpresa(java.lang.String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public java.lang.String getCarteira() {
		return this.carteira;
	}

	public void setCarteira(java.lang.String carteira) {
		this.carteira = carteira;
	}

	public int getCodigoProduto() {
		return this.codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public int getNumeroApolice() {
		return this.numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public java.time.LocalDate getDataInicioVigencia() {
		return this.dataInicioVigencia;
	}

	public void setDataInicioVigencia(java.time.LocalDate dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public java.time.LocalDate getDataFinalVigencia() {
		return this.dataFinalVigencia;
	}

	public void setDataFinalVigencia(java.time.LocalDate dataFinalVigencia) {
		this.dataFinalVigencia = dataFinalVigencia;
	}

	public java.lang.String getCodigoGrupoMecsas() {
		return this.codigoGrupoMecsas;
	}

	public void setCodigoGrupoMecsas(java.lang.String codigoGrupoMecsas) {
		this.codigoGrupoMecsas = codigoGrupoMecsas;
	}

	public java.lang.String getNumeroContrato() {
		return this.numeroContrato;
	}

	public void setNumeroContrato(java.lang.String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public boolean isProRata() {
		return this.proRata;
	}

	public void setProRata(boolean proRata) {
		this.proRata = proRata;
	}

	public java.time.LocalDate getDataInicioVigenciaEmpresaPrincipal() {
		return this.dataInicioVigenciaEmpresaPrincipal;
	}

	public void setDataInicioVigenciaEmpresaPrincipal(
			java.time.LocalDate dataInicioVigenciaEmpresaPrincipal) {
		this.dataInicioVigenciaEmpresaPrincipal = dataInicioVigenciaEmpresaPrincipal;
	}

	public java.lang.String getPermanencia() {
		return this.permanencia;
	}

	public void setPermanencia(java.lang.String permanencia) {
		this.permanencia = permanencia;
	}

	public java.lang.String getCodFatorPlano() {
		return this.codFatorPlano;
	}

	public void setCodFatorPlano(java.lang.String codFatorPlano) {
		this.codFatorPlano = codFatorPlano;
	}

	public int getCodClassificacaoCi() {
		return this.codClassificacaoCi;
	}

	public void setCodClassificacaoCi(int codClassificacaoCi) {
		this.codClassificacaoCi = codClassificacaoCi;
	}

	public Empresa(java.lang.String codigoEmpresa, java.lang.String carteira,
			int codigoProduto, int numeroApolice,
			java.time.LocalDate dataInicioVigencia,
			java.time.LocalDate dataFinalVigencia,
			java.lang.String codigoGrupoMecsas,
			java.lang.String numeroContrato, boolean proRata,
			java.time.LocalDate dataInicioVigenciaEmpresaPrincipal,
			java.lang.String permanencia, java.lang.String codFatorPlano,
			int codClassificacaoCi) {
		this.codigoEmpresa = codigoEmpresa;
		this.carteira = carteira;
		this.codigoProduto = codigoProduto;
		this.numeroApolice = numeroApolice;
		this.dataInicioVigencia = dataInicioVigencia;
		this.dataFinalVigencia = dataFinalVigencia;
		this.codigoGrupoMecsas = codigoGrupoMecsas;
		this.numeroContrato = numeroContrato;
		this.proRata = proRata;
		this.dataInicioVigenciaEmpresaPrincipal = dataInicioVigenciaEmpresaPrincipal;
		this.permanencia = permanencia;
		this.codFatorPlano = codFatorPlano;
		this.codClassificacaoCi = codClassificacaoCi;
	}

}