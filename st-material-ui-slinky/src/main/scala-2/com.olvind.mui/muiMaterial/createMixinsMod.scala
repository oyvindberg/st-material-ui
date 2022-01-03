package com.olvind.mui.muiMaterial

import com.olvind.mui.csstype.mod.AtRule.FontFace
import com.olvind.mui.csstype.mod.Properties
import com.olvind.mui.muiMaterial.muiMaterialNumbers.`0`
import com.olvind.mui.muiSystem.createBreakpointsMod.Breakpoints
import com.olvind.mui.muiSystem.createSpacingMod.Spacing
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMixinsMod {
  
  @JSImport("@mui/material/styles/createMixins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(breakpoints: Breakpoints, spacing: Spacing, mixins: MixinsOptions): Mixins = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoints.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], mixins.asInstanceOf[js.Any])).asInstanceOf[Mixins]
  
  @js.native
  trait BaseCSSProperties
    extends StObject
       with Properties[Double | String, String] {
    
    var `@font-face`: js.UndefOr[Fontface | js.Array[Fontface]] = js.native
  }
  object BaseCSSProperties {
    
    @scala.inline
    def apply(): BaseCSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseCSSProperties]
    }
    
    @scala.inline
    implicit class BaseCSSPropertiesMutableBuilder[Self <: BaseCSSProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set@font-face`(value: Fontface | js.Array[Fontface]): Self = StObject.set(x, "@font-face", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@font-faceUndefined`: Self = StObject.set(x, "@font-face", js.undefined)
      
      @scala.inline
      def `set@font-faceVarargs`(value: Fontface*): Self = StObject.set(x, "@font-face", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CSSProperties
    extends StObject
       with BaseCSSProperties
       with // Allow pseudo selectors and media queries
  // `unknown` is used since TS does not allow assigning an interface without
  // an index signature to one with an index signature. This is to allow type safe
  // module augmentation.
  // Technically we want any key not typed in `BaseCSSProperties` to be of type
  // `CSSProperties` but this doesn't work. The index signature needs to cover
  // BaseCSSProperties as well. Usually you would use `BaseCSSProperties[keyof BaseCSSProperties]`
  // but this would not allow assigning React.CSSProperties to CSSProperties
  /* k */ StringDictionary[Any | CSSProperties]
  object CSSProperties {
    
    @scala.inline
    def apply(): CSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSProperties]
    }
  }
  
  @js.native
  trait Fontface
    extends StObject
       with FontFace[String | `0`, String] {
    
    var fallbacks: js.UndefOr[js.Array[FontFace[String | `0`, String]]] = js.native
  }
  object Fontface {
    
    @scala.inline
    def apply(): Fontface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fontface]
    }
    
    @scala.inline
    implicit class FontfaceMutableBuilder[Self <: Fontface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallbacks(value: js.Array[FontFace[String | `0`, String]]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbacksUndefined: Self = StObject.set(x, "fallbacks", js.undefined)
      
      @scala.inline
      def setFallbacksVarargs(value: (FontFace[String | `0`, String])*): Self = StObject.set(x, "fallbacks", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Mixins extends StObject {
    
    var toolbar: CSSProperties = js.native
  }
  object Mixins {
    
    @scala.inline
    def apply(toolbar: CSSProperties): Mixins = {
      val __obj = js.Dynamic.literal(toolbar = toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mixins]
    }
    
    @scala.inline
    implicit class MixinsMutableBuilder[Self <: Mixins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToolbar(value: CSSProperties): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@mui/material.@mui/material/styles/createMixins.Mixins> */
  @js.native
  trait MixinsOptions extends StObject {
    
    var toolbar: js.UndefOr[CSSProperties] = js.native
  }
  object MixinsOptions {
    
    @scala.inline
    def apply(): MixinsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MixinsOptions]
    }
    
    @scala.inline
    implicit class MixinsOptionsMutableBuilder[Self <: MixinsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToolbar(value: CSSProperties): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    }
  }
  
  type NormalCssProperties = Properties[Double | String, String]
}
