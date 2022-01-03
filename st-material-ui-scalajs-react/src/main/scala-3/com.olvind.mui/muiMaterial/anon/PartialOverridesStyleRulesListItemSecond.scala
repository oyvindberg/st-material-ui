package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<ListItemSecondaryActionClassKey>> */
trait PartialOverridesStyleRulesListItemSecond extends StObject {
  
  var disableGutters: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesListItemSecond {
  
  inline def apply(): PartialOverridesStyleRulesListItemSecond = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesListItemSecond]
  }
  
  extension [Self <: PartialOverridesStyleRulesListItemSecond](x: Self) {
    
    inline def setDisableGutters(value: CSSInterpolation): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    inline def setDisableGuttersNull: Self = StObject.set(x, "disableGutters", null)
    
    inline def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
