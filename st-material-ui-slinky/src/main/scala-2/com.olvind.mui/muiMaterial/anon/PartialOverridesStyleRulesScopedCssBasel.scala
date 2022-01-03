package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<ScopedCssBaselineClassKey>> */
@js.native
trait PartialOverridesStyleRulesScopedCssBasel extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesScopedCssBasel {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesScopedCssBasel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesScopedCssBasel]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesScopedCssBaselMutableBuilder[Self <: PartialOverridesStyleRulesScopedCssBasel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
