package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    @Test
    void deveRetornarFuncionariosEmpresa() {
        Gestor gestor1 = new Gestor("Ayla Alice Mendes", "683.830.639-54", "Diretor Administrativo");
        Funcionario funcionario11 = new Funcionario("Paulo Mário da Cunha", "299.044.184-03", "Analista de RH");
        Funcionario funcionario12 = new Funcionario("Carla Antonella Vieira", "547.424.716-87", "Analista de R&S");

        gestor1.addSubordinado(funcionario11);
        gestor1.addSubordinado(funcionario12);

        Gestor gestor2 = new Gestor("Marlene Yasmin Benedita Peixoto", "6890.566.462-81", "Diretor de Comunicações");
        Gestor gestor21 = new Gestor("Luna Eloá Castro", "130.238.226-89", "Diretor de Marketing");
        Funcionario funcionario211 = new Funcionario("Luana Raquel Mariana", "203.733.926-72", "Propagandista");
        Funcionario funcionario212 = new Funcionario("Juliana Josefa da Rosa", "613.595.681-74", "Social Media");

        gestor21.addSubordinado(funcionario211);
        gestor21.addSubordinado(funcionario212);
        gestor2.addSubordinado(gestor21);

        Gestor presidente = new Gestor("Mário Diogo Pires", "623.757.235-03", "Presidente");
        presidente.addSubordinado(gestor1);
        presidente.addSubordinado(gestor2);

        Empresa empresa = new Empresa();
        empresa.setFuncionarios(presidente);

        String expected = "Gestor: Presidente - Mário Diogo Pires / 623.757.235-03\n" +
                "Gestor: Diretor Administrativo - Ayla Alice Mendes / 683.830.639-54\n" +
                "Funcionário: Analista de RH - Paulo Mário da Cunha / 299.044.184-03\n" +
                "Funcionário: Analista de R&S - Carla Antonella Vieira / 547.424.716-87\n" +
                "Gestor: Diretor de Comunicações - Marlene Yasmin Benedita Peixoto / 6890.566.462-81\n" +
                "Gestor: Diretor de Marketing - Luna Eloá Castro / 130.238.226-89\n" +
                "Funcionário: Propagandista - Luana Raquel Mariana / 203.733.926-72\n" +
                "Funcionário: Social Media - Juliana Josefa da Rosa / 613.595.681-74\n";
        assertEquals(expected, empresa.getFuncionarios());
    }

    @Test
    void deveRetornarExcecaoEmpresaSemFuncionarios() {
        try {
            Empresa empresa = new Empresa();
            empresa.getFuncionarios();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Ops. Não há funcionários cadastrados para esta empresa.", e.getMessage());
        }
    }
}