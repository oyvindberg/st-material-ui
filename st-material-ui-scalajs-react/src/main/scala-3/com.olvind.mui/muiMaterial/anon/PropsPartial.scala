package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.gridGridMod.GridProps
import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartial extends StObject {
  
  var props: com.olvind.mui.std.Partial[GridProps["div", js.Object]]
  
  var style: Interpolation[Theme]
}
object PropsPartial {
  
  inline def apply(props: com.olvind.mui.std.Partial[GridProps["div", js.Object]]): PropsPartial = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartial]
  }
  
  extension [Self <: PropsPartial](x: Self) {
    
    inline def setProps(value: com.olvind.mui.std.Partial[GridProps["div", js.Object]]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
