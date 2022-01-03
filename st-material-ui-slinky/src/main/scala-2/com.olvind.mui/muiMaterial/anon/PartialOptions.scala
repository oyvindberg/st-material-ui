package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/useMediaQuery.Options> */
@js.native
trait PartialOptions extends StObject {
  
  var defaultMatches: js.UndefOr[Boolean] = js.native
  
  var matchMedia: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.matchMedia */ Any
  ] = js.native
  
  var noSsr: js.UndefOr[Boolean] = js.native
  
  var ssrMatchMedia: js.UndefOr[js.Function1[/* query */ String, Matches]] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMatches(value: Boolean): Self = StObject.set(x, "defaultMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMatchesUndefined: Self = StObject.set(x, "defaultMatches", js.undefined)
    
    @scala.inline
    def setMatchMedia(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.matchMedia */ Any
    ): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchMediaUndefined: Self = StObject.set(x, "matchMedia", js.undefined)
    
    @scala.inline
    def setNoSsr(value: Boolean): Self = StObject.set(x, "noSsr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSsrUndefined: Self = StObject.set(x, "noSsr", js.undefined)
    
    @scala.inline
    def setSsrMatchMedia(value: /* query */ String => Matches): Self = StObject.set(x, "ssrMatchMedia", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSsrMatchMediaUndefined: Self = StObject.set(x, "ssrMatchMedia", js.undefined)
  }
}
