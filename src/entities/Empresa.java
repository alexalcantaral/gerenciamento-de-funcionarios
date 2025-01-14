package entities;

import java.util.ArrayList;

public class Empresa {

    private String nomeEmpresa;
    ArrayList<Funcionario> list = new ArrayList<>();

    public Empresa(ArrayList<Funcionario> list, String nomeEmpresa) {
        this.list = list;
        this.nomeEmpresa = nomeEmpresa;
    }

    public ArrayList<Funcionario> getList() {
        return list;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        for(Funcionario func : list){
            if(func.getId() == funcionario.getId()){
                System.out.println("ID de funcionário já existe!");
                return;
            }
        }
        list.add(funcionario);
    }

    public void removerFuncionario(int id){
        list.removeIf(func -> func.getId() == id);
    }

    public void buscarFuncionario(int id){
        for(Funcionario func : list){
            if(func.getId() == id){
                System.out.println(func);
            }
        }
    }

    public void exibirFuncionarios(){
        for(Funcionario func : list){
            System.out.println(func);
        }
    }
}
