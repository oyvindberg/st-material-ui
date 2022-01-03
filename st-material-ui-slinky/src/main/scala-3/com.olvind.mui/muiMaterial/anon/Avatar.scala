package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.typographyTypographyMod.TypographyProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatar[SubheaderTypographyComponent /* <: ReactElement */, TitleTypographyComponent /* <: ReactElement */] extends StObject {
  
  /**
    * The action to display in the card header.
    */
  var action: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The Avatar element to display.
    */
  var avatar: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialCardHeaderClasses] = js.undefined
  
  /**
    * If `true`, `subheader` and `title` won't be wrapped by a Typography component.
    * This can be useful to render an alternative Typography variant by wrapping
    * the `title` text, and optional `subheader` text
    * with the Typography component.
    * @default false
    */
  var disableTypography: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the component.
    */
  var subheader: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * These props will be forwarded to the subheader
    * (as long as disableTypography is not `true`).
    */
  var subheaderTypographyProps: js.UndefOr[TypographyProps[SubheaderTypographyComponent, `6`[SubheaderTypographyComponent]]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.undefined
  
  /**
    * The content of the component.
    */
  var title: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * These props will be forwarded to the title
    * (as long as disableTypography is not `true`).
    */
  var titleTypographyProps: js.UndefOr[TypographyProps[TitleTypographyComponent, `7`[TitleTypographyComponent]]] = js.undefined
}
object Avatar {
  
  inline def apply[SubheaderTypographyComponent /* <: ReactElement */, TitleTypographyComponent /* <: ReactElement */](): Avatar[SubheaderTypographyComponent, TitleTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avatar[SubheaderTypographyComponent, TitleTypographyComponent]]
  }
  
  extension [Self <: Avatar[?, ?], SubheaderTypographyComponent /* <: ReactElement */, TitleTypographyComponent /* <: ReactElement */](x: Self & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])) {
    
    inline def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAvatar(value: ReactElement): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setClasses(value: PartialCardHeaderClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDisableTypography(value: Boolean): Self = StObject.set(x, "disableTypography", value.asInstanceOf[js.Any])
    
    inline def setDisableTypographyUndefined: Self = StObject.set(x, "disableTypography", js.undefined)
    
    inline def setSubheader(value: ReactElement): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
    
    inline def setSubheaderTypographyProps(value: TypographyProps[SubheaderTypographyComponent, `6`[SubheaderTypographyComponent]]): Self = StObject.set(x, "subheaderTypographyProps", value.asInstanceOf[js.Any])
    
    inline def setSubheaderTypographyPropsUndefined: Self = StObject.set(x, "subheaderTypographyProps", js.undefined)
    
    inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    
    inline def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleTypographyProps(value: TypographyProps[TitleTypographyComponent, `7`[TitleTypographyComponent]]): Self = StObject.set(x, "titleTypographyProps", value.asInstanceOf[js.Any])
    
    inline def setTitleTypographyPropsUndefined: Self = StObject.set(x, "titleTypographyProps", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
