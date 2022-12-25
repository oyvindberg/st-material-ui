package com.olvind.mui.muiJoy.stylesTypesVariantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariantOverrides extends StObject {
  
  var outlined: js.UndefOr[VariantOutlinedInversion] = js.undefined
  
  var plain: js.UndefOr[VariantPlainInversion] = js.undefined
  
  var soft: VariantSoftInversion
  
  var solid: VariantSolidInversion
}
object VariantOverrides {
  
  inline def apply(soft: VariantSoftInversion, solid: VariantSolidInversion): VariantOverrides = {
    val __obj = js.Dynamic.literal(soft = soft.asInstanceOf[js.Any], solid = solid.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariantOverrides] (val x: Self) extends AnyVal {
    
    inline def setOutlined(value: VariantOutlinedInversion): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
    
    inline def setOutlinedUndefined: Self = StObject.set(x, "outlined", js.undefined)
    
    inline def setPlain(value: VariantPlainInversion): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    
    inline def setSoft(value: VariantSoftInversion): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
    
    inline def setSolid(value: VariantSolidInversion): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
  }
}
