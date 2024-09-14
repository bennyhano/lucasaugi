package gu.dtalk;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import static com.google.common.base.Preconditions.*;

public enum ItemType {
	/** 参数类型 */OPTION,
	/** 命令 */CMD,
	/** 菜单*/MENU;
	public static final IItem parseItem(JSONObject jsonObject)  {
		String c = checkNotNull((String) jsonObject.get("catalog"),"NOT FOUND catalog field");
		ItemType catalog = ItemType.valueOf(c);
		switch(catalog){
		case OPTION:
			return OptionType.parseOption(jsonObject);
		case CMD:
			return TypeUtils.castToJavaBean(jsonObject, CmdItem.class);
		case MENU:
			return TypeUtils.castToJavaBean(jsonObject, MenuItem.class);
		default:
			throw new IllegalArgumentException("UNSUPPORTED CATALOG: " + c); 
		}

	}
}
