package com.olvind.mui.muiJoy.stylesTypesVariantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Record<@mui/joy.@mui/joy/styles/types/variants.VariantProp, std.Array<@mui/joy.@mui/joy/styles/types/variants.VariantProp> | undefined>> */
trait ColorInversionConfig extends StObject {
  
  var outlined: js.UndefOr[js.Array[VariantProp]] = js.undefined
  
  var plain: js.UndefOr[js.Array[VariantProp]] = js.undefined
  
  var soft: js.UndefOr[js.Array[VariantProp]] = js.undefined
  
  var solid: js.UndefOr[js.Array[VariantProp]] = js.undefined
}
object ColorInversionConfig {
  
  inline def apply(): ColorInversionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorInversionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorInversionConfig] (val x: Self) extends AnyVal {
    
    inline def setOutlined(value: js.Array[VariantProp]): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
    
    inline def setOutlinedUndefined: Self = StObject.set(x, "outlined", js.undefined)
    
    inline def setOutlinedVarargs(value: VariantProp*): Self = StObject.set(x, "outlined", js.Array(value*))
    
    inline def setPlain(value: js.Array[VariantProp]): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    
    inline def setPlainVarargs(value: VariantProp*): Self = StObject.set(x, "plain", js.Array(value*))
    
    inline def setSoft(value: js.Array[VariantProp]): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
    
    inline def setSoftUndefined: Self = StObject.set(x, "soft", js.undefined)
    
    inline def setSoftVarargs(value: VariantProp*): Self = StObject.set(x, "soft", js.Array(value*))
    
    inline def setSolid(value: js.Array[VariantProp]): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
    
    inline def setSolidUndefined: Self = StObject.set(x, "solid", js.undefined)
    
    inline def setSolidVarargs(value: VariantProp*): Self = StObject.set(x, "solid", js.Array(value*))
  }
}
