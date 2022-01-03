package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.center
import com.olvind.mui.muiMaterial.muiMaterialStrings.fullWidth
import com.olvind.mui.muiMaterial.muiMaterialStrings.horizontal
import com.olvind.mui.muiMaterial.muiMaterialStrings.inset
import com.olvind.mui.muiMaterial.muiMaterialStrings.left
import com.olvind.mui.muiMaterial.muiMaterialStrings.middle
import com.olvind.mui.muiMaterial.muiMaterialStrings.right
import com.olvind.mui.muiMaterial.muiMaterialStrings.vertical
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Absolute extends StObject {
  
  /**
    * Absolutely position the element.
    * @default false
    */
  var absolute: js.UndefOr[Boolean] = js.native
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialDividerClasses] = js.native
  
  /**
    * If `true`, a vertical divider will have the correct height when used in flex container.
    * (By default, a vertical divider will have a calculated height of `0px` if it is the child of a flex container.)
    * @default false
    */
  var flexItem: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the divider will have a lighter color.
    * @default false
    */
  var light: js.UndefOr[Boolean] = js.native
  
  /**
    * The component orientation.
    * @default 'horizontal'
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * The text alignment.
    * @default 'center'
    */
  var textAlign: js.UndefOr[center | right | left] = js.native
  
  /**
    * The variant to use.
    * @default 'fullWidth'
    */
  var variant: js.UndefOr[fullWidth | inset | middle] = js.native
}
object Absolute {
  
  @scala.inline
  def apply(): Absolute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Absolute]
  }
  
  @scala.inline
  implicit class AbsoluteMutableBuilder[Self <: Absolute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialDividerClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setFlexItem(value: Boolean): Self = StObject.set(x, "flexItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexItemUndefined: Self = StObject.set(x, "flexItem", js.undefined)
    
    @scala.inline
    def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSxNull: Self = StObject.set(x, "sx", null)
    
    @scala.inline
    def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    @scala.inline
    def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value :_*))
    
    @scala.inline
    def setTextAlign(value: center | right | left): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setVariant(value: fullWidth | inset | middle): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
