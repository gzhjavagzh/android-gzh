if (cursor.moveToNext()) {
		cardtype = cursor.getString(0);
		cursor.close();
} else {
		// 截取前三位找不到的话
		// 截取前四位
		String num2 = number.substring(0, 4);
		String[] selectionArgs2 = new String[] { num2 };
		String sql2 = "select city from info where area = ?";
		Cursor cursor2 = db.rawQuery(sql2, selectionArgs2);
		if (cursor2.moveToNext()) {
			cardtype = cursor2.getString(0);
			cursor2.close();
		}
}
