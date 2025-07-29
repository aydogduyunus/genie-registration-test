package utilities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtils {

    public static <T> T convertJsonToJava(String json, Class<T> cls){ // Generic Method
        try {
            return new ObjectMapper().readValue(json, cls);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

  /*  Bu kod, JSON formatındaki bir metni belirtilen Java sınıfına dönüştüren bir genel (generic) bir metodun örneğidir.
  Aşağıda kodun işleyişini açıklayan bazı notlar bulunmaktadır:

public static <T> T convertJsonToJava(String json, Class<T> cls):

        Bu satırda convertJsonToJava adında bir metod tanımlanır.
<T> ifadesi genel bir (generic) metod olduğunu belirtir. Bu, metodun herhangi bir türde veri dönüştürebileceği anlamına gelir.
        T türü, metoda dönüştürülen Java nesnesinin türünü belirtmek için kullanılır.
        String json parametresi, dönüştürülecek JSON metnini temsil eder.
        Class<T> cls parametresi, dönüştürülecek Java nesnesinin sınıfını belirtir.
        try-catch bloğu:

        JSON metnini belirtilen Java sınıfına dönüştürmek için ObjectMapper sınıfının readValue metodu kullanılır.
        JsonProcessingException türündeki istisnalar yakalanır ve RuntimeException ile yeniden fırlatılır.
        Bu, metodu kullanan kodun daha kolay hata işleme yapabilmesini sağlar.
        return new ObjectMapper().readValue(json, cls):

        Bu satırda JSON metni, ObjectMapper sınıfının readValue metodu kullanılarak belirtilen Java sınıfına dönüştürülür.
        cls parametresi, hangi Java sınıfına dönüştürüleceğini belirler.
        Bu kod, ObjectMapper kütüphanesini kullanarak JSON metinlerini Java nesnelerine dönüştürmek için yaygın olarak kullanılan bir yaklaşımı temsil eder.
        Bu metot, dönüştürülecek Java sınıfının türünü genel (generic) olarak belirtir, böylece farklı türlerde nesneleri dönüştürmek için kullanılabilir.

        */

