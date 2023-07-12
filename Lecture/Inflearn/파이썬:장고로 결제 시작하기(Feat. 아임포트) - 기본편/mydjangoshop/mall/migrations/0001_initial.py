# Generated by Django 3.2.5 on 2023-07-12 08:39

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Category',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=100, unique=True)),
            ],
            options={
                'verbose_name': '상품 분류',
                'verbose_name_plural': '상품 분류',
            },
        ),
        migrations.CreateModel(
            name='Product',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(db_index=True, max_length=100)),
                ('description', models.TextField(blank=True)),
                ('price', models.PositiveIntegerField()),
                ('status', models.CharField(choices=[('a', '정상'), ('s', '품절'), ('o', '단종'), ('i', '비활성화')], default='i', max_length=1)),
                ('photo', models.ImageField(upload_to='mall/product/photo/%Y/%m/%d')),
                ('category', models.ForeignKey(db_constraint=False, on_delete=django.db.models.deletion.CASCADE, to='mall.category')),
            ],
            options={
                'verbose_name': '상품',
                'verbose_name_plural': '상품',
            },
        ),
    ]
