
# Solid
---



## مرور پروژه

این پروژه جاوا یک سیستم سفارش و پرداخت ساده را پیاده سازی می‌کند. این شامل کلاس‌هایی برای سفارشات (`Order` و `Food`), سرویس‌های پرداخت (`OnlineOrderService`, `OnSiteOrderService`, و `PhoneOrderService`), و یک کلاس اصلی (`Main`) برای تعامل با کاربر است.

## تغییرات اعمال شده

1. **رابط OrderService:**
    - **تغییرات اعمال شده:**
        - اضافه کردن متدها برای ثبت نام و پرداخت سفارش تلفنی.
    - **توضیح:**
        - رابط `OrderService` را گسترش داده‌ام تا شامل متدهای مدیریت سفارشات تلفنی شود.

2. **کلاس PhoneOrderService:**
    - **تغییرات اعمال شده:**
        - پیاده‌سازی متدهای ثبت نام و پرداخت سفارش تلفنی.
    - **توضیح:**
        - یک کلاس جدید به نام `PhoneOrderService` اضافه کردم که رابط گسترده شده `OrderService` را پیاده‌سازی کرده و قابلیت سفارشات تلفنی را فراهم می‌کند.

3. **کلاس OnSiteOrderService:**
    - **تغییرات اعمال شده:**
        - به‌روزرسانی کلاس برای پیاده‌سازی متدهای سفارش تلفنی.
    - **توضیح:**
        - کلاس موجود `OnSiteOrderService` را تغییر دادم تا با رابط به‌روزشده `OrderService` سازگار باشد.

4. **کلاس OnlineOrderService:**
    - **تغییرات اعمال شده:**
        - به‌روزرسانی کلاس برای پیاده‌سازی متدهای سفارش تلفنی.
    - **توضیح:**
        - کلاس موجود `OnlineOrderService` را تغییر دادم تا با رابط به‌روزشده `OrderService` سازگار باشد.

5. **کلاس Main:**
    - **تغییرات اعمال شده:**
        - تغییر در کلاس برای شامل کردن گزینه سفارشات تلفنی.
    - **توضیح:**
        - کلاس `Main` را به‌روز کردم تا به کاربر امکان انتخاب سفارشات تلفنی را فراهم کند و مطابق این امکان با کاربر ارتباط برقرار کند.

| محل اعمال تغییرات (کلاس/واسط)               | انواع تغییر                       | توضیح                                                                                                        |
|--------------------------|-----------------------------------|--------------------------------------------------------------------------------------------------------------|
| OrderService Interface   | Added methods for phone orders    | Extended the `OrderService` interface to include `phoneOrderRegister` and `phoneOrderPayment` methods.       |
| PhoneOrderService Class  | Implemented phone order methods   | Created a new class `PhoneOrderService` implementing the extended `OrderService` interface for phone orders. |
| OnSiteOrderService Class | Updated to implement phone orders | Modified the existing `OnSiteOrderService` class to comply with the updated `OrderService` interface.        |
| OnlineOrderService Class | Updated to implement phone orders | Modified the existing `OnlineOrderService` class to comply with the updated `OrderService` interface.        |
| Main Class               | Modified to include phone orders  | Updated the `Main` class to allow users to choose phone orders as a payment method and interact accordingly. |

 ### تعداد تغیرات : ۱۴


## گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>&nbsp;تمامی کلاس های برنامه مسئولیت خودشان را دارند </p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp; از انجایی هر کلاس order service متد های خودش را دارد این امکان وجود دارد که هرکدام تغییرات مناسب خودشان را داشته باشند </p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p> اینترفیس به گونه ای است که اضافه کردن متد ها باعث میشود تا بقیه ی کلاس ها هم عوض شوند همچنین در main خیلی از if و else iهایی استفاده شده که با یک extention نیاز به modification زیادی میشود.&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس‌ها به درستی از رابط OrderService پیروی می‌کنند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>در اینترفیس OrderService متد باعث ایجاد متد هایی در کلاس های دیگر میکنند که بدنه نخواهند داشت</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;استفاده از اینترفیس و در تابع مین با این اینترفیس کارکردن</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>در تابع main در خطوط پایانی با استفاده کردن از instance این اصل را نقض کرده</p>
</td>
</tr>
</tbody>
</table>


در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:



<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;Open-Close Principle (OCP)

</p>
</td>
<td width="246">
<p>&nbsp;طراحی و استفاده از اینترفیس و همچنین استفاده از instance of و if else های نا مناسب در main</p>
</td>
<td width="284">
<p>&nbsp;طراحی بهتر اینترفیس و استفاده از abstraction</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;Interface Segregation Principle

</p>
</td>
<td width="246">
<p>&nbsp;استفاده نا درست از interface </p>
</td>
<td width="284">
<p>&nbsp;ایجاد abstraction و استفاده از polymorphism</p>
</td>
</tr>
<tr>
<tr>
<td width="168">
<p>Dependency Inversion Principle

</p>
</td>
<td width="246">
<p>&nbsp;استفاده از instance of در main</p>
</td>
<td width="284">
<p>استفاده از polymorphis</p>
</td>
</tr>
</tbody>
</table>


