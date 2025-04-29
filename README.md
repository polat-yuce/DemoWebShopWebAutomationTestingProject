<h1>Demo Web Shop Test Otomasyon Projesi</h1>

<h2>📚 Proje Hakkında</h2>
<p>
Bu proje, <strong>Java programlama dili</strong> kullanılarak, <strong>Selenium WebDriver</strong> ile geliştirilmiş bir web test otomasyon projesidir.<br>
<code>https://demowebshop.tricentis.com</code> adresinde yer alan e-ticaret sitesinde bir kullanıcının gerçekleştirebileceği temel işlemler (kayıt olma, giriş yapma, çıkış yapma, ürün satın alma, anket yanıtlama, fatura görüntüleme vb.) senaryoları otomatikleştirilmiştir.
</p>
<p>
Amacım, Demo Web Shop üzerindeki kullanıcı akışlarını test ederek sistemin doğru çalıştığını doğrulamak ve potansiyel hataları önceden tespit etmektir.
</p>

<h2>📋 Gerçekleştirilen Kullanıcı Hikayeleri</h2>
<table>
<thead>
<tr>
<th>Kullanıcı Hikayesi</th>
<th>Açıklama</th>
</tr>
</thead>
<tbody>
<tr>
<td>US_201</td>
<td>Başarılı kullanıcı kaydı</td>
</tr>
<tr>
<td>US_202</td>
<td>Hatalı e-posta ile tekrar kayıt olma</td>
</tr>
<tr>
<td>US_203</td>
<td>Başarılı çıkış yapma</td>
</tr>
<tr>
<td>US_204</td>
<td>Giriş işlemi</td>
</tr>
<tr>
<td>US_205</td>
<td>Geçersiz bilgilerle giriş denemesi</td>
</tr>
<tr>
<td>US_206</td>
<td>Ürün siparişi verme</td>
</tr>
<tr>
<td>US_207</td>
<td>Anket yanıtlama</td>
</tr>
<tr>
<td>US_208</td>
<td>Kupon / hediye kodu olmadan ödeme</td>
</tr>
<tr>
<td>US_209</td>
<td>Fatura görüntüleme ve indirme</td>
</tr>
</tbody>
</table>

<h2>✅ Uygulanan Test Senaryoları</h2>
<ul>
<li><strong>Pozitif Testler:</strong>
  <ul>
    <li>Kayıt formu ile başarılı kullanıcı oluşturma</li>
    <li>Geçerli bilgilerle giriş yapma ve doğrulama</li>
    <li>Oturum kapatma işlemi</li>
    <li>Ürün sepete eklenip başarıyla satın alma</li>
    <li>Fatura görüntüleme ve indirme</li>
    <li>Anket sorusuna oy verme</li>
  </ul>
</li>
<li><strong>Negatif Testler:</strong>
  <ul>
    <li>Aynı e-posta ile ikinci kez kayıt olma</li>
    <li>Boş veya geçersiz bilgilerle giriş denemeleri</li>
    <li>Geçersiz kupon/gift card kullanma</li>
  </ul>
</li>
</ul>

