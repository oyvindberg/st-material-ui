package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<DialogContentClassKey>> */
@js.native
trait PartialOverridesStyleRulesDialogContentC extends StObject {
  
  var dividers: js.UndefOr[CSSInterpolation] = js.native
  
  var root: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesDialogContentC {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesDialogContentC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesDialogContentC]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesDialogContentCMutableBuilder[Self <: PartialOverridesStyleRulesDialogContentC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDividers(value: CSSInterpolation): Self = StObject.set(x, "dividers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividersNull: Self = StObject.set(x, "dividers", null)
    
    @scala.inline
    def setDividersUndefined: Self = StObject.set(x, "dividers", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
