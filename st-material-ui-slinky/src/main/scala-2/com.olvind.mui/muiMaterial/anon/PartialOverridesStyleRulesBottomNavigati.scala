package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<BottomNavigationClassKey>> */
@js.native
trait PartialOverridesStyleRulesBottomNavigati extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesBottomNavigati {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesBottomNavigati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesBottomNavigati]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesBottomNavigatiMutableBuilder[Self <: PartialOverridesStyleRulesBottomNavigati] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
