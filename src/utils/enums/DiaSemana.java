package utils.enums;

public enum DiaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;

    @Override
    public String toString() {
        return switch (this){
            case SEGUNDA -> "Segunda";
            case TERCA -> "Terça";
            case QUARTA -> "Quarta";
            case QUINTA -> "Quinta";
            case SEXTA -> "Sexta";
            case SABADO -> "Sábado";
            case DOMINGO -> "Domingo";
        };
    }
}
