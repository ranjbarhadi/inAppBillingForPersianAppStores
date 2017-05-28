<div dir="rtl">

[![](https://jitpack.io/v/ranjbarhadi/inAppBillingForPersianAppStores.svg)](https://jitpack.io/#ranjbarhadi/inAppBillingForPersianAppStores)


پیاده سازی کردن پرداخت درون برنامه ای گاهی اوقات می تواند سخت و پیچیده باشد. مخصوصا با اندروید استادیو و گردل. ما سعی کردیم این موضوع را برای شما بسیار ساده کنیم. با استفاده از این کتابخانه می توانید به سادگی پرداخت درون برنامه ای را برای بازار و مایکت راه اندازی کنید.
قابل ذکر است که این کتابخانه از کتابخانه ی ارائه شده در هر دو مارکت ایرانی بازار و مایکت کاملتر است و بسیاری از خطا های موجود در این کتابخانه ها بر طرف شده است.

نحوه راه اندازی
-------------------
برای این کار ابتدا فایل build.gradle در شاخه ی اصلی پروژه ی خود را تغییر داده و ریپاسیتوری jitpack.io را به آن اضافه کنید. در پایان شکل کد شما باید همانند زیر باشد:

<div dir="ltr">

    allprojects {
        repositories {
            [ریپاسیتوری های قبلی شما]
            maven { url 'https://jitpack.io' }
        }
    }

</div>



سپس متن زیر را به فایل gradle خود و در بخش dependencies اضافه کنید.

<div dir="ltr">

    compile 'com.github.ranjbarhadi:inAppBillingForPersianAppStores:1.7'
    
</div>

دانلود اپ نمونه
-------------------
برای آشنایی با فرآیند پرداخت درون برنامه ای می توانید همین پروژه را دانلود کنید. راه دیگر این است که به برنامه اندروید استادیو بروید. از منوی file گزینه ی close project را بزنید تا از پروژه ای که هم اکنون مشغول آن هستید خارج شوید. سپس در صفحه ی جدید گزینه ی `check out project from Version Control` را انتخاب و git را کلیک کنید. در پنجره ی جدید در بالا آدرس
 
<div dir="ltr"> 

    git@github.com:ranjbarhadi/inAppBillingForPersianAppStores.git

</div>

را وارد کنید. پروژه به صورت خود به خود ساخته و آماده می شود. 

با بررسی فایل MainActivity می توانید نحوه ی کارکرد پروژه را دریابید.




</div>