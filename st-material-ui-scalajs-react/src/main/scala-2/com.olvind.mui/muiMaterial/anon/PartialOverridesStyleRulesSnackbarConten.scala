package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<SnackbarContentClassKey>> */
@js.native
trait PartialOverridesStyleRulesSnackbarConten extends StObject {
  
  var action: js.UndefOr[CSSInterpolation] = js.native
  
  var message: js.UndefOr[CSSInterpolation] = js.native
  
  var root: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesSnackbarConten {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesSnackbarConten = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesSnackbarConten]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesSnackbarContenMutableBuilder[Self <: PartialOverridesStyleRulesSnackbarConten] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: CSSInterpolation): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNull: Self = StObject.set(x, "action", null)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setMessage(value: CSSInterpolation): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
