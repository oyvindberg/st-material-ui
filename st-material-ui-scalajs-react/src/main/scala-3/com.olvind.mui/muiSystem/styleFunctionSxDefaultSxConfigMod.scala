package com.olvind.mui.muiSystem

import com.olvind.mui.muiStyledEngine.mod.CSSObject
import com.olvind.mui.muiSystem.boxBoxMod.StyleFunction
import com.olvind.mui.muiSystem.styleMod.TransformFunction
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.std.Partial
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleFunctionSxDefaultSxConfigMod extends Shortcut {
  
  @JSImport("@mui/system/styleFunctionSx/defaultSxConfig", JSImport.Default)
  @js.native
  val default: SxConfig = js.native
  
  type SimpleStyleFunction[PropKey /* <: /* keyof any */ String */] = StyleFunction[Partial[Record[PropKey, Any]]]
  
  type SxConfig = Record[String, SxConfigRecord]
  
  trait SxConfigRecord extends StObject {
    
    var cssProperty: js.UndefOr["hack" | false] = js.undefined
    
    var style: js.UndefOr[SimpleStyleFunction[Any]] = js.undefined
    
    /**
      * dot access in `Theme`
      */
    var themeKey: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[TransformFunction] = js.undefined
  }
  object SxConfigRecord {
    
    inline def apply(): SxConfigRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SxConfigRecord]
    }
    
    extension [Self <: SxConfigRecord](x: Self) {
      
      inline def setCssProperty(value: "hack" | false): Self = StObject.set(x, "cssProperty", value.asInstanceOf[js.Any])
      
      inline def setCssPropertyUndefined: Self = StObject.set(x, "cssProperty", js.undefined)
      
      inline def setStyle(value: Partial[Record[Any, Any]] => Any): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setThemeKey(value: String): Self = StObject.set(x, "themeKey", value.asInstanceOf[js.Any])
      
      inline def setThemeKeyUndefined: Self = StObject.set(x, "themeKey", js.undefined)
      
      inline def setTransform(value: (/* cssValue */ Any, /* userValue */ Any) => Double | String | CSSProperties | CSSObject): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type _To = SxConfig
  
  /* This means you don't have to write `default`, but can instead just say `styleFunctionSxDefaultSxConfigMod.foo` */
  override def _to: SxConfig = default
}
