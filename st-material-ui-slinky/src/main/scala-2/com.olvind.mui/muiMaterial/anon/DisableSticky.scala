package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.default
import com.olvind.mui.muiMaterial.muiMaterialStrings.inherit
import com.olvind.mui.muiMaterial.muiMaterialStrings.primary
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableSticky extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialListSubheaderClasses] = js.native
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'default'
    */
  var color: js.UndefOr[default | primary | inherit] = js.native
  
  /**
    * If `true`, the List Subheader will not have gutters.
    * @default false
    */
  var disableGutters: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the List Subheader will not stick to the top during scroll.
    * @default false
    */
  var disableSticky: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the List Subheader is indented.
    * @default false
    */
  var inset: js.UndefOr[Boolean] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
}
object DisableSticky {
  
  @scala.inline
  def apply(): DisableSticky = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableSticky]
  }
  
  @scala.inline
  implicit class DisableStickyMutableBuilder[Self <: DisableSticky] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialListSubheaderClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColor(value: default | primary | inherit): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisableGutters(value: Boolean): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    @scala.inline
    def setDisableSticky(value: Boolean): Self = StObject.set(x, "disableSticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStickyUndefined: Self = StObject.set(x, "disableSticky", js.undefined)
    
    @scala.inline
    def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
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
  }
}
