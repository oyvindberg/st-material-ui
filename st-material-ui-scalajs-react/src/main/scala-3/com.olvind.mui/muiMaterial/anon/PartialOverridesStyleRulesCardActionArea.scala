package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<CardActionAreaClassKey>> */
trait PartialOverridesStyleRulesCardActionArea extends StObject {
  
  var focusHighlight: js.UndefOr[CSSInterpolation] = js.undefined
  
  var focusVisible: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesCardActionArea {
  
  inline def apply(): PartialOverridesStyleRulesCardActionArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesCardActionArea]
  }
  
  extension [Self <: PartialOverridesStyleRulesCardActionArea](x: Self) {
    
    inline def setFocusHighlight(value: CSSInterpolation): Self = StObject.set(x, "focusHighlight", value.asInstanceOf[js.Any])
    
    inline def setFocusHighlightNull: Self = StObject.set(x, "focusHighlight", null)
    
    inline def setFocusHighlightUndefined: Self = StObject.set(x, "focusHighlight", js.undefined)
    
    inline def setFocusVisible(value: CSSInterpolation): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleNull: Self = StObject.set(x, "focusVisible", null)
    
    inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
