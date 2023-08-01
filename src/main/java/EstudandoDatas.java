import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EstudandoDatas {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
        System.out.println(dataHora.getYear());
        System.out.println(dataHora.getMonthValue());
        System.out.println(dataHora.getDayOfWeek());

        int ano = 2023;
        int mes = 12;
        int dia = 27;

        LocalDate dataValida = LocalDate.of(ano, mes, dia);
        System.out.println(dataValida);

        LocalDate data1 = LocalDate.now();
        LocalDate data2 = LocalDate.of(2023, 8, 2);

        if(data1.isAfter(data2)){
            System.out.println("A data ja passou");
        }
        else {
            System.out.println("A data ainda não passou");
        }

        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dataHora.format(formatoBr));

    }
}
