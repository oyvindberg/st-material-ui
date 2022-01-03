package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<RadioClassKey>> */
trait PartialOverridesStyleRulesRadioClassKey extends StObject {
  
  var checked: js.UndefOr[CSSInterpolation] = js.undefined
  
  var colorPrimary: js.UndefOr[CSSInterpolation] = js.undefined
  
  var colorSecondary: js.UndefOr[CSSInterpolation] = js.undefined
  
  var disabled: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesRadioClassKey {
  
  inline def apply(): PartialOverridesStyleRulesRadioClassKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesRadioClassKey]
  }
  
  extension [Self <: PartialOverridesStyleRulesRadioClassKey](x: Self) {
    
    inline def setChecked(value: CSSInterpolation): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedNull: Self = StObject.set(x, "checked", null)
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setColorPrimary(value: CSSInterpolation): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    inline def setColorPrimaryNull: Self = StObject.set(x, "colorPrimary", null)
    
    inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    inline def setColorSecondary(value: CSSInterpolation): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
    
    inline def setColorSecondaryNull: Self = StObject.set(x, "colorSecondary", null)
    
    inline def setColorSecondaryUndefined: Self = StObject.set(x, "colorSecondary", js.undefined)
    
    inline def setDisabled(value: CSSInterpolation): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
