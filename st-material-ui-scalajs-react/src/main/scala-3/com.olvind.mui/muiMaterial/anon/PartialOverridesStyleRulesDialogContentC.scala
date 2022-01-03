package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<DialogContentClassKey>> */
trait PartialOverridesStyleRulesDialogContentC extends StObject {
  
  var dividers: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesDialogContentC {
  
  inline def apply(): PartialOverridesStyleRulesDialogContentC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesDialogContentC]
  }
  
  extension [Self <: PartialOverridesStyleRulesDialogContentC](x: Self) {
    
    inline def setDividers(value: CSSInterpolation): Self = StObject.set(x, "dividers", value.asInstanceOf[js.Any])
    
    inline def setDividersNull: Self = StObject.set(x, "dividers", null)
    
    inline def setDividersUndefined: Self = StObject.set(x, "dividers", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
