package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<DialogTitleClassKey>> */
@js.native
trait PartialOverridesStyleRulesDialogTitleCla extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesDialogTitleCla {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesDialogTitleCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesDialogTitleCla]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesDialogTitleClaMutableBuilder[Self <: PartialOverridesStyleRulesDialogTitleCla] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
