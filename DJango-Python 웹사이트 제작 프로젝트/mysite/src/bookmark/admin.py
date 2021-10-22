from django.contrib import admin
from bookmark.models import Bookmark
# Register your models here.

# 어드민 사이트에 테이블을 반영
@admin.register(Bookmark)
class BookmarkAdmin(admin.ModelAdmin):
    list_display = ('id','title','url')