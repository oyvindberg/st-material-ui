package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<ListItemSecondaryActionClassKey>> */
@js.native
trait PartialOverridesStyleRulesListItemSecond extends StObject {
  
  var disableGutters: js.UndefOr[CSSInterpolation] = js.native
  
  var root: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesListItemSecond {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesListItemSecond = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesListItemSecond]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesListItemSecondMutableBuilder[Self <: PartialOverridesStyleRulesListItemSecond] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableGutters(value: CSSInterpolation): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableGuttersNull: Self = StObject.set(x, "disableGutters", null)
    
    @scala.inline
    def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
