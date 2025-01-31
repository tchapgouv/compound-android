/*
 * Copyright 2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.compound.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import io.element.android.compound.annotations.CoreColorToken
import io.element.android.compound.tokens.generated.SemanticColors
import io.element.android.compound.tokens.generated.internal.LightColorTokens

@OptIn(CoreColorToken::class)
fun SemanticColors.toMaterialColorSchemeLight(): ColorScheme = lightColorScheme(
    primary = textPrimary,
    onPrimary = textOnSolidPrimary,
    primaryContainer = textOnSolidPrimary,
    onPrimaryContainer = textPrimary,
    inversePrimary = textOnSolidPrimary,
    secondary = textSecondary,
    onSecondary = textOnSolidPrimary,
    secondaryContainer = bgSubtlePrimary,
    onSecondaryContainer = textPrimary,
    tertiary = textSecondary,
    onTertiary = textOnSolidPrimary,
    tertiaryContainer = textPrimary,
    onTertiaryContainer = textOnSolidPrimary,
    background = textOnSolidPrimary,
    onBackground = textPrimary,
    surface = textOnSolidPrimary,
    onSurface = textPrimary,
    surfaceVariant = LightColorTokens.colorGray300,
    onSurfaceVariant = iconSecondary,
    surfaceTint = LightColorTokens.colorGray1000,
    inverseSurface = LightColorTokens.colorGray1300,
    inverseOnSurface = textOnSolidPrimary,
    error = bgCriticalPrimary,
    onError = textOnSolidPrimary,
    errorContainer = LightColorTokens.colorRed400,
    onErrorContainer = textCriticalPrimary,
    outline = iconSecondary,
    outlineVariant = LightColorTokens.colorAlphaGray400,
    scrim = textPrimary,
)
