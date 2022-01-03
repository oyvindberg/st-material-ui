package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<PopoverClassKey>> */
@js.native
trait PartialOverridesStyleRulesPopoverClassKe extends StObject {
  
  var paper: js.UndefOr[CSSInterpolation] = js.native
  
  var root: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesPopoverClassKe {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesPopoverClassKe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesPopoverClassKe]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesPopoverClassKeMutableBuilder[Self <: PartialOverridesStyleRulesPopoverClassKe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaper(value: CSSInterpolation): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperNull: Self = StObject.set(x, "paper", null)
    
    @scala.inline
    def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
