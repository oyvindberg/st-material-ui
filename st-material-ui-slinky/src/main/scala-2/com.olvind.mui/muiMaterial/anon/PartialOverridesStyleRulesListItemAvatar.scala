package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<ListItemAvatarClassKey>> */
@js.native
trait PartialOverridesStyleRulesListItemAvatar extends StObject {
  
  var alignItemsFlexStart: js.UndefOr[CSSInterpolation] = js.native
  
  var root: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesListItemAvatar {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesListItemAvatar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesListItemAvatar]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesListItemAvatarMutableBuilder[Self <: PartialOverridesStyleRulesListItemAvatar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItemsFlexStart(value: CSSInterpolation): Self = StObject.set(x, "alignItemsFlexStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignItemsFlexStartNull: Self = StObject.set(x, "alignItemsFlexStart", null)
    
    @scala.inline
    def setAlignItemsFlexStartUndefined: Self = StObject.set(x, "alignItemsFlexStart", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
