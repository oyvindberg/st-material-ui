package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<PopoverClassKey>> */
trait PartialOverridesStyleRulesPopoverClassKe extends StObject {
  
  var paper: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesPopoverClassKe {
  
  inline def apply(): PartialOverridesStyleRulesPopoverClassKe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesPopoverClassKe]
  }
  
  extension [Self <: PartialOverridesStyleRulesPopoverClassKe](x: Self) {
    
    inline def setPaper(value: CSSInterpolation): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    inline def setPaperNull: Self = StObject.set(x, "paper", null)
    
    inline def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
