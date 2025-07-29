Feature: Kullanıcı kayıt işlemi

  Scenario: Geçici e-posta adresi ile kayıt olma ve e-posta doğrulama süreci

    Given Kullanıcı Genie ana sayfasına gider
    And Çıkan kurabiye bilgilendirme penceresini kabul eder
    And "Login" butonunun görünür olduğunu doğrular
    When Kullanıcı "Login" butonuna tıklar
    Then Kullanıcı "Sign up" bağlantısının görünür olduğunu doğrular
    When Kullanıcı "Sign up" bağlantısına tıklar
    Then Kullanıcı kayıt formunun yüklendiğini ve "E-posta" alanının görünür olduğunu doğrular

    And Kullanıcı yeni sekmede fake mail sitesini açar
    And Geçici bir e-posta adresi alır
    And Genie sekmesine geri döner
    And E-posta alanına geçici adresi yazar
     # CAPTCHA nedeniyle test bu noktada durdurulmuştur.
  Scenario: Kayıt işlemi doğrulama adımında durur
    Given Kullanıcı kayıt formunu doldurur
    And CAPTCHA adımına gelir
    # CAPTCHA geçilemediği için test burada sonlandırılır