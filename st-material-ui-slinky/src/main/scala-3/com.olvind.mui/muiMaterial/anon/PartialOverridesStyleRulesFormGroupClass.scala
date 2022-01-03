package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<FormGroupClassKey>> */
trait PartialOverridesStyleRulesFormGroupClass extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
  
  var row: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesFormGroupClass {
  
  inline def apply(): PartialOverridesStyleRulesFormGroupClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesFormGroupClass]
  }
  
  extension [Self <: PartialOverridesStyleRulesFormGroupClass](x: Self) {
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setRow(value: CSSInterpolation): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowNull: Self = StObject.set(x, "row", null)
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
