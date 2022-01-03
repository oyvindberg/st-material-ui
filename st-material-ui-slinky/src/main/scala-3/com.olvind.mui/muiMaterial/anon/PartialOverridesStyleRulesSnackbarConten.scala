package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<SnackbarContentClassKey>> */
trait PartialOverridesStyleRulesSnackbarConten extends StObject {
  
  var action: js.UndefOr[CSSInterpolation] = js.undefined
  
  var message: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesSnackbarConten {
  
  inline def apply(): PartialOverridesStyleRulesSnackbarConten = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesSnackbarConten]
  }
  
  extension [Self <: PartialOverridesStyleRulesSnackbarConten](x: Self) {
    
    inline def setAction(value: CSSInterpolation): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMessage(value: CSSInterpolation): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
