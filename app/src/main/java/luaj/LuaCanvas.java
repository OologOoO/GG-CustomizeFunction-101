package luaj;

import android.graphics.Canvas;

public class LuaCanvas extends LuaValue {

    private Canvas canvas;
    public static LuaValue s_metatable;
    
    @Override
    public int e_() {
        return 12;
    }

    @Override
    public String f_() {
        return "canvas";
    }

    @Override
    public LuaValue i() {
        return s_metatable;
    }

    public static LuaCanvas valueOf(Canvas canvas){
        return new LuaCanvas(canvas);
    }

    private LuaCanvas(Canvas canvas){
        this.canvas = canvas;
    }

    public static Canvas checkcanvas(LuaValue luaValue) {
        return luaValue instanceof LuaCanvas ? ((LuaCanvas) luaValue).canvas : null;
    }
}
