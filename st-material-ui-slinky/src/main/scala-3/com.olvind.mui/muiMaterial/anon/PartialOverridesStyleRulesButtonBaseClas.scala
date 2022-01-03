package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<ButtonBaseClassKey>> */
trait PartialOverridesStyleRulesButtonBaseClas extends StObject {
  
  var disabled: js.UndefOr[CSSInterpolation] = js.undefined
  
  var focusVisible: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesButtonBaseClas {
  
  inline def apply(): PartialOverridesStyleRulesButtonBaseClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesButtonBaseClas]
  }
  
  extension [Self <: PartialOverridesStyleRulesButtonBaseClas](x: Self) {
    
    inline def setDisabled(value: CSSInterpolation): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocusVisible(value: CSSInterpolation): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleNull: Self = StObject.set(x, "focusVisible", null)
    
    inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
