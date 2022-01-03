package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<TableFooterClassKey>> */
@js.native
trait PartialOverridesStyleRulesTableFooterCla extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesTableFooterCla {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesTableFooterCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesTableFooterCla]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesTableFooterClaMutableBuilder[Self <: PartialOverridesStyleRulesTableFooterCla] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
