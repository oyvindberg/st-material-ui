package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<AccordionActionsClassKey>> */
@js.native
trait PartialOverridesStyleRulesAccordionActio extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.native
  
  var spacing: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesAccordionActio {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesAccordionActio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesAccordionActio]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesAccordionActioMutableBuilder[Self <: PartialOverridesStyleRulesAccordionActio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSpacing(value: CSSInterpolation): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingNull: Self = StObject.set(x, "spacing", null)
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
